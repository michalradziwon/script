
  package gen;
  public class E_Gen105 {
  		@com.google.inject.Inject
  		public E_Gen105(E_Gen106 e_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  