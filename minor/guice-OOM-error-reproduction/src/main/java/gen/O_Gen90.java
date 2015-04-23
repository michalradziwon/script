
  package gen;
  public class O_Gen90 {
  		@com.google.inject.Inject
  		public O_Gen90(O_Gen91 o_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  