
  package gen;
  public class U_Gen178 {
  		@com.google.inject.Inject
  		public U_Gen178(U_Gen179 u_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  