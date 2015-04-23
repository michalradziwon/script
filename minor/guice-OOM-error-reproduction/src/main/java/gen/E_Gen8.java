
  package gen;
  public class E_Gen8 {
  		@com.google.inject.Inject
  		public E_Gen8(E_Gen9 e_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  