
  package gen;
  public class E_Gen66 {
  		@com.google.inject.Inject
  		public E_Gen66(E_Gen67 e_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  