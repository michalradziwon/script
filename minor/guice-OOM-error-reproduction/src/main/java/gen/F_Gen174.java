
  package gen;
  public class F_Gen174 {
  		@com.google.inject.Inject
  		public F_Gen174(F_Gen175 f_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  