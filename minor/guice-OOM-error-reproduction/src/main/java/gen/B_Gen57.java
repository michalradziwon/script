
  package gen;
  public class B_Gen57 {
  		@com.google.inject.Inject
  		public B_Gen57(B_Gen58 b_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  