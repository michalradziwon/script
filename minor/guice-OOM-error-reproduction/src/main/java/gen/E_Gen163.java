
  package gen;
  public class E_Gen163 {
  		@com.google.inject.Inject
  		public E_Gen163(E_Gen164 e_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  