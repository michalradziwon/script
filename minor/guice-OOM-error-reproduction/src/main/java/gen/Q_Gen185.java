
  package gen;
  public class Q_Gen185 {
  		@com.google.inject.Inject
  		public Q_Gen185(Q_Gen186 q_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  