
  package gen;
  public class R_Gen151 {
  		@com.google.inject.Inject
  		public R_Gen151(R_Gen152 r_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  