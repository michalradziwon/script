
  package gen;
  public class Q_Gen70 {
  		@com.google.inject.Inject
  		public Q_Gen70(Q_Gen71 q_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  