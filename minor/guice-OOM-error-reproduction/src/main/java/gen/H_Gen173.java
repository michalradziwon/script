
  package gen;
  public class H_Gen173 {
  		@com.google.inject.Inject
  		public H_Gen173(H_Gen174 h_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  