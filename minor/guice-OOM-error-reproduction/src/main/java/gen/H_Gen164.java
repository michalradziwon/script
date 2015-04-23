
  package gen;
  public class H_Gen164 {
  		@com.google.inject.Inject
  		public H_Gen164(H_Gen165 h_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  