
  package gen;
  public class F_Gen22 {
  		@com.google.inject.Inject
  		public F_Gen22(F_Gen23 f_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  