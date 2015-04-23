
  package gen;
  public class O_Gen103 {
  		@com.google.inject.Inject
  		public O_Gen103(O_Gen104 o_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  