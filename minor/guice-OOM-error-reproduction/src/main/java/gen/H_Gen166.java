
  package gen;
  public class H_Gen166 {
  		@com.google.inject.Inject
  		public H_Gen166(H_Gen167 h_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  