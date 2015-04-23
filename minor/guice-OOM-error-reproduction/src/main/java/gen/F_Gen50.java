
  package gen;
  public class F_Gen50 {
  		@com.google.inject.Inject
  		public F_Gen50(F_Gen51 f_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  