
  package gen;
  public class O_Gen97 {
  		@com.google.inject.Inject
  		public O_Gen97(O_Gen98 o_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  