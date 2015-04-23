
  package gen;
  public class O_Gen165 {
  		@com.google.inject.Inject
  		public O_Gen165(O_Gen166 o_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  