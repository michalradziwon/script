
  package gen;
  public class H_Gen57 {
  		@com.google.inject.Inject
  		public H_Gen57(H_Gen58 h_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  