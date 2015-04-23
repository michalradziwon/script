
  package gen;
  public class Q_Gen97 {
  		@com.google.inject.Inject
  		public Q_Gen97(Q_Gen98 q_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  