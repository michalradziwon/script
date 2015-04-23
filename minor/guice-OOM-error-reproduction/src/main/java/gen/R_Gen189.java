
  package gen;
  public class R_Gen189 {
  		@com.google.inject.Inject
  		public R_Gen189(R_Gen190 r_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  