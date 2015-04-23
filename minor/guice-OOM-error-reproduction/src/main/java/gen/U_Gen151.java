
  package gen;
  public class U_Gen151 {
  		@com.google.inject.Inject
  		public U_Gen151(U_Gen152 u_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  