
  package gen;
  public class O_Gen57 {
  		@com.google.inject.Inject
  		public O_Gen57(O_Gen58 o_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  