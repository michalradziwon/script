
  package gen;
  public class Q_Gen22 {
  		@com.google.inject.Inject
  		public Q_Gen22(Q_Gen23 q_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  