
  package gen;
  public class E_Gen137 {
  		@com.google.inject.Inject
  		public E_Gen137(E_Gen138 e_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  