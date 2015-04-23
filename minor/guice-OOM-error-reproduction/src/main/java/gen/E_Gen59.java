
  package gen;
  public class E_Gen59 {
  		@com.google.inject.Inject
  		public E_Gen59(E_Gen60 e_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  