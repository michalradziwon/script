
  package gen;
  public class M_Gen188 {
  		@com.google.inject.Inject
  		public M_Gen188(M_Gen189 m_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  