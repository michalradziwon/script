
  package gen;
  public class F_Gen45 {
  		@com.google.inject.Inject
  		public F_Gen45(F_Gen46 f_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  