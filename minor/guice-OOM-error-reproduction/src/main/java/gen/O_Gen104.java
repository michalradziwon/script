
  package gen;
  public class O_Gen104 {
  		@com.google.inject.Inject
  		public O_Gen104(O_Gen105 o_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  