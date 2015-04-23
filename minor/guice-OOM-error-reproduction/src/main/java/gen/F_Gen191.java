
  package gen;
  public class F_Gen191 {
  		@com.google.inject.Inject
  		public F_Gen191(F_Gen192 f_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  