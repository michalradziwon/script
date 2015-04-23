
  package gen;
  public class Q_Gen84 {
  		@com.google.inject.Inject
  		public Q_Gen84(Q_Gen85 q_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  