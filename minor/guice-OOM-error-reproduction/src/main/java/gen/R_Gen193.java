
  package gen;
  public class R_Gen193 {
  		@com.google.inject.Inject
  		public R_Gen193(R_Gen194 r_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  