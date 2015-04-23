
  package gen;
  public class R_Gen57 {
  		@com.google.inject.Inject
  		public R_Gen57(R_Gen58 r_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  