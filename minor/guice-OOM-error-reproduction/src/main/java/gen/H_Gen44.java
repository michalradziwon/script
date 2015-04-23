
  package gen;
  public class H_Gen44 {
  		@com.google.inject.Inject
  		public H_Gen44(H_Gen45 h_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  