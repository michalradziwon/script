
  package gen;
  public class R_Gen173 {
  		@com.google.inject.Inject
  		public R_Gen173(R_Gen174 r_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  