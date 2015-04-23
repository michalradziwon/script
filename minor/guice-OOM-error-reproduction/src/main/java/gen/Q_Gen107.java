
  package gen;
  public class Q_Gen107 {
  		@com.google.inject.Inject
  		public Q_Gen107(Q_Gen108 q_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  