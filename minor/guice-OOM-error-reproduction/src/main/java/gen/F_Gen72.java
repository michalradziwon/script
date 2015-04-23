
  package gen;
  public class F_Gen72 {
  		@com.google.inject.Inject
  		public F_Gen72(F_Gen73 f_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  