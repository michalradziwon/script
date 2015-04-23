
  package gen;
  public class F_Gen197 {
  		@com.google.inject.Inject
  		public F_Gen197(F_Gen198 f_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  