
  package gen;
  public class D_Gen57 {
  		@com.google.inject.Inject
  		public D_Gen57(D_Gen58 d_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  