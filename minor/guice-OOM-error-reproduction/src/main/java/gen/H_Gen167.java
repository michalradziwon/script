
  package gen;
  public class H_Gen167 {
  		@com.google.inject.Inject
  		public H_Gen167(H_Gen168 h_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  