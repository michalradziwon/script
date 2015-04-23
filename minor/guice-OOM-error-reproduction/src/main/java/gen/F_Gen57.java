
  package gen;
  public class F_Gen57 {
  		@com.google.inject.Inject
  		public F_Gen57(F_Gen58 f_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  