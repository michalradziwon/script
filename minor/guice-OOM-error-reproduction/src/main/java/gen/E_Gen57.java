
  package gen;
  public class E_Gen57 {
  		@com.google.inject.Inject
  		public E_Gen57(E_Gen58 e_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  