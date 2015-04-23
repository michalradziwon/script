
  package gen;
  public class H_Gen192 {
  		@com.google.inject.Inject
  		public H_Gen192(H_Gen193 h_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  