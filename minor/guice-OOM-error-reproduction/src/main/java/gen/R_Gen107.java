
  package gen;
  public class R_Gen107 {
  		@com.google.inject.Inject
  		public R_Gen107(R_Gen108 r_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  