
  package gen;
  public class R_Gen43 {
  		@com.google.inject.Inject
  		public R_Gen43(R_Gen44 r_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  