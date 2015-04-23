
  package gen;
  public class F_Gen175 {
  		@com.google.inject.Inject
  		public F_Gen175(F_Gen176 f_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  