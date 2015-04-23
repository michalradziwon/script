
  package gen;
  public class O_Gen164 {
  		@com.google.inject.Inject
  		public O_Gen164(O_Gen165 o_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  