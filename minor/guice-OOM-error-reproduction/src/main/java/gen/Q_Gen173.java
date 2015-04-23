
  package gen;
  public class Q_Gen173 {
  		@com.google.inject.Inject
  		public Q_Gen173(Q_Gen174 q_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  