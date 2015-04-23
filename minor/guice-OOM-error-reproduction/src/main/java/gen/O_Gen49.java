
  package gen;
  public class O_Gen49 {
  		@com.google.inject.Inject
  		public O_Gen49(O_Gen50 o_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  