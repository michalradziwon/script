
  package gen;
  public class R_Gen178 {
  		@com.google.inject.Inject
  		public R_Gen178(R_Gen179 r_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  