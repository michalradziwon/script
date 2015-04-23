
  package gen;
  public class D_Gen171 {
  		@com.google.inject.Inject
  		public D_Gen171(D_Gen172 d_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  