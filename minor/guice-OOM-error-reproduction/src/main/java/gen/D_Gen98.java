
  package gen;
  public class D_Gen98 {
  		@com.google.inject.Inject
  		public D_Gen98(D_Gen99 d_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  