
  package gen;
  public class H_Gen48 {
  		@com.google.inject.Inject
  		public H_Gen48(H_Gen49 h_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  