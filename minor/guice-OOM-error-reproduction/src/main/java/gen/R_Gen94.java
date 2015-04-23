
  package gen;
  public class R_Gen94 {
  		@com.google.inject.Inject
  		public R_Gen94(R_Gen95 r_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  